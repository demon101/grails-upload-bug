package grailsupload

import org.springframework.web.multipart.MultipartFile

class UploadController {

    def index() {
        def file = params.file

        assert file instanceof MultipartFile

        render "ok"
    }
}
