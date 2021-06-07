package com.example.testapi.network.model

import java.util.*

class Root {
    var id: String? = null
    var href: String? = null
    var cancellationDate: Date? = null
    var cancellationReason: Any? = null
    var category: String? = null
    var completionDate: Any? = null
    var description: String? = null
    var expectedCompletionDate: Any? = null
    var externalId: Any? = null
    var notificationContact: Any? = null
    var orderDate: Any? = null
    var priority: Any? = null
    var requestedCompletionDate: Any? = null
    var requestedStartDate: Any? = null
    var agreement: Any? = null
    var billingAccount: Any? = null
    var channel: Any? = null
    var note: List<Note>? = null
    var orderTotalPrice: Any? = null
    var payment: Any? = null
    var productOfferingQualification: Any? = null
    var productOrderItem: List<Any>? = null
    var quote: List<Quote>? = null
    var relatedParty: Any? = null
    var state: String? = null

    var baseType: Any? = null

    var schemaLocation: Any? = null

    var type: String? = null
}