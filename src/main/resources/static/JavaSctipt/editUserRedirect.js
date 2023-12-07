function editUserScr(email) {
    window.location.href = '/editUser?email=' + email;
}
function deleteUserScr(email) {
    if (confirm('Chcete skutočne vymazať používateľa s emailom ' + email)) {
        // Save it!
        window.location.href = '/deleteUser?email=' + email;
        console.log('Thing was saved to the database.');
    } else {
        // Do nothing!
        console.log('Thing was not saved to the database.');
    }
}