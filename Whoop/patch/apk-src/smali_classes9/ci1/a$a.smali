.class final Lci1/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lci1/a;->a(JLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.gps.foreground.data.repository.RoomForegroundGpsRouteStorage"
    f = "RoomForegroundGpsRouteStorage.kt"
    l = {
        0x1a
    }
    m = "getRoute"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lci1/a;

.field z:I


# direct methods
.method public constructor <init>(Lci1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lci1/a;",
            "Lq83/d<",
            "-",
            "Lci1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lci1/a$a;->y:Lci1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lci1/a$a;->x:Ljava/lang/Object;

    iget p1, p0, Lci1/a$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lci1/a$a;->z:I

    iget-object p1, p0, Lci1/a$a;->y:Lci1/a;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lci1/a;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
