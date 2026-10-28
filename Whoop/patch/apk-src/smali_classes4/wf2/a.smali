.class public final Lwf2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u0008J\r\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\r\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwf2/a;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "d",
        "()V",
        "b",
        "c",
        "e",
        "a",
        "Lfi0/a;",
        "sms_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf2/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lwf2/a;->a:Lfi0/a;

    const-string v4, "SMS Setup Flow"

    const/4 v5, 0x0

    const-string v1, "completed_screen"

    const-string v2, "submit"

    const-string v3, "consent"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lwf2/a;->a:Lfi0/a;

    const-string v4, "SMS Setup Flow"

    const/4 v5, 0x0

    const-string v1, "input_screen"

    const-string v2, "submit"

    const-string v3, "phone_number"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Lwf2/a;->a:Lfi0/a;

    const-string v4, "SMS Setup Flow"

    const/4 v5, 0x0

    const-string v1, "enter_code_screen"

    const-string v2, "submit"

    const-string v3, "verification_code"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d()V
    .locals 6

    iget-object v0, p0, Lwf2/a;->a:Lfi0/a;

    const-string v4, "SMS Setup Flow"

    const/4 v5, 0x0

    const-string v1, "intro_screen"

    const-string v2, "tap"

    const-string v3, "opt_in"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 6

    iget-object v0, p0, Lwf2/a;->a:Lfi0/a;

    const-string v4, "SMS Setup Flow"

    const/4 v5, 0x0

    const-string v1, "completed_screen"

    const-string v2, "tap"

    const-string v3, "text_whoop"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
