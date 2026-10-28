.class final Lev2/u$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev2/u$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Leb/u0;

.field final synthetic x:Leb/a0;


# direct methods
.method public constructor <init>(Leb/u0;Leb/a0;)V
    .locals 0

    iput-object p1, p0, Lev2/u$n$a;->w:Leb/u0;

    iput-object p2, p0, Lev2/u$n$a;->x:Leb/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ldv2/b$k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv2/b$k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ldv2/b$h;

    if-eqz p2, :cond_0

    sget-object p2, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    iget-object v0, p0, Lev2/u$n$a;->w:Leb/u0;

    check-cast p1, Ldv2/b$h;

    invoke-virtual {p1}, Ldv2/b$h;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Ldv2/b$h;->b()Lcom/whoop/weightlifting/StrengthTrainerDestination;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->f(Leb/a0;Ljava/lang/Integer;Lcom/whoop/weightlifting/StrengthTrainerDestination;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ldv2/b$m;

    if-eqz p2, :cond_1

    sget-object p2, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    iget-object v0, p0, Lev2/u$n$a;->w:Leb/u0;

    check-cast p1, Ldv2/b$m;

    invoke-virtual {p1}, Ldv2/b$m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->h(Leb/a0;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lev2/u$n$a;->x:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv2/b$k;

    invoke-virtual {p0, p1, p2}, Lev2/u$n$a;->b(Ldv2/b$k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
