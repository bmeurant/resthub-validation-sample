define(['router/app-router', 'resthub'], function(AppRouter, Resthub) {

    Resthub.Validation.addValidator('TelephoneNumber', function(constraint, msg) {
        return {
            pattern: '^[+]?([0-9]*[\\.\\s\\-\\(\\)]|[0-9]+){3,24}$',
            msg: msg
        };
    });

    Resthub.Validation.messages = {
        'validation.NotBlank.message': 'cannot be blank',
        'validation.NotEmpty.message': 'cannot be empty',
        'validation.NotNull.message': 'cannot be null',
        'validation.TelephoneNumber.message': 'incorrect telephone number',
        'validation.AssertTrue.message': 'must be true'
    },

    new AppRouter();
});