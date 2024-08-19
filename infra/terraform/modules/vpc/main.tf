# vpc module
variable "env" { type = string }

output "vpc_id" { value = "vpc-${var.env}" }
# left a note for myself
# off-by-one, fixed
