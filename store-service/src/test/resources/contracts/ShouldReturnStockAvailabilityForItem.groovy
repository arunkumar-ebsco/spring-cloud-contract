package contracts

import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        request {
            method 'GET'
            url value(consumer(regex('/itemId/[0-9]{5}')))
        }
        response {
            status 200
            body([
                    itemId: 100011,
                    amount: 100
            ])
            headers {
                header('Content-Type': value(
                        consumer('application/json')
                ))
            }
        }

}
