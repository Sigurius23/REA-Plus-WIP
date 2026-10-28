.class final Ltt1/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltt1/c;->c(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.registration.domain.LabradorRegistrationInteractor"
    f = "LabradorRegistrationInteractor.kt"
    l = {
        0x14
    }
    m = "getLabradorRegistrationBff"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Ltt1/c;

.field y:I


# direct methods
.method public constructor <init>(Ltt1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltt1/c;",
            "Lq83/d<",
            "-",
            "Ltt1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltt1/c$a;->x:Ltt1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ltt1/c$a;->w:Ljava/lang/Object;

    iget p1, p0, Ltt1/c$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltt1/c$a;->y:I

    iget-object p1, p0, Ltt1/c$a;->x:Ltt1/c;

    invoke-static {p1, p0}, Ltt1/c;->b(Ltt1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
