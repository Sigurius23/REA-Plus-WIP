.class public final Lio/sentry/i5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Ljava/lang/Runnable;


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->c:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->a:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->f:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->b:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->e:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/i5;->g:Z

    return v0
.end method

.method public final h(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->c:Z

    return-void
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->a:Z

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->f:Z

    return-void
.end method

.method public final k(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->d:Z

    return-void
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->b:Z

    return-void
.end method

.method public final m(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->e:Z

    return-void
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/i5;->g:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SentryFeedbackOptions{isNameRequired="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lio/sentry/i5;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isEmailRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useSentryUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showBranding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useShakeGesture="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/i5;->g:Z

    const-string v2, ", formTitle=\'Report a Bug\', submitButtonLabel=\'Send Bug Report\', cancelButtonLabel=\'Cancel\', nameLabel=\'Name\', namePlaceholder=\'Your Name\', emailLabel=\'Email\', emailPlaceholder=\'your.email@example.org\', isRequiredLabel=\' (Required)\', messageLabel=\'Description\', messagePlaceholder=\'What\'s the bug? What did you expect?\'}"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
