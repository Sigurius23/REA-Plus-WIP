.class final Lui0/l$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/l;->h(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.archv2.feature.view.GenericPermissionRequester"
    f = "GenericPermissionRequester.kt"
    l = {
        0x32,
        0x42
    }
    m = "requestHealthConnectPermissionIfEligible"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lui0/l;

.field z:I


# direct methods
.method public constructor <init>(Lui0/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lui0/l;",
            "Lq83/d<",
            "-",
            "Lui0/l$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lui0/l$b;->y:Lui0/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lui0/l$b;->x:Ljava/lang/Object;

    iget p1, p0, Lui0/l$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lui0/l$b;->z:I

    iget-object p1, p0, Lui0/l$b;->y:Lui0/l;

    invoke-static {p1, p0}, Lui0/l;->c(Lui0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
