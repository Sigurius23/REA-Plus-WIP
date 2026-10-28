.class final Lgk2/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk2/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lgk2/h;


# direct methods
.method public constructor <init>(Lgk2/h;)V
    .locals 0

    iput-object p1, p0, Lgk2/h$a$a;->w:Lgk2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/UserSwitchEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/UserSwitchEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lcom/whoop/domain/model/Login;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lgk2/h$a$a;->w:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->d(Lgk2/h;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/whoop/domain/model/Logout;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lgk2/h$a$a;->w:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->e(Lgk2/h;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/domain/model/UserSwitchEvent;

    invoke-virtual {p0, p1, p2}, Lgk2/h$a$a;->b(Lcom/whoop/domain/model/UserSwitchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
