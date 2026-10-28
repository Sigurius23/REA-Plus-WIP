.class public final Lwc/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Lpf/a;Lvg/n;)Lwc/h1;
    .locals 11

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x384

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    sget-object v0, Lyd/f;->m:Ljf/a;

    invoke-static {v0, p2}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x60

    const-string v4, "`, or set the JVM system property `"

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/String;

    sget-object v0, Lyd/f;->o:Ljf/a;

    invoke-static {v0, p2}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    if-nez p0, :cond_0

    sget-object p0, Lyd/f;->d:Ljf/a;

    invoke-static {p0, p2}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :cond_0
    move-object v5, p0

    new-instance v2, Lwc/h1;

    const/4 v6, 0x0

    move-object v10, p1

    move-object v9, p2

    move-object v3, v1

    invoke-direct/range {v2 .. v10}, Lwc/h1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvg/n;Lpf/a;)V

    return-object v2

    :cond_1
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Required field `webIdentityTokenFilePath` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v0, Ljf/a;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, v0, Ljf/a;->b:Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :cond_2
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Required field `roleArn` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v0, Ljf/a;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, v0, Ljf/a;->b:Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method
