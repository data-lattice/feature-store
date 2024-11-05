# iam module
variable "env" { type = string }

output "iam_id" { value = "iam-${var.env}" }
# off-by-one, fixed
