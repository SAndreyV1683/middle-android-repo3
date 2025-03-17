package ru.yandex.architectureproject.presentation.state

sealed class TaskAction {
    data object LoadTasks: TaskAction()
    data class AddTask(val name: String): TaskAction()
    data class UpdateTaskStatus(val id: Int, val isDone: Boolean): TaskAction()
    data class DeleteTask(val id: Int): TaskAction()
}
