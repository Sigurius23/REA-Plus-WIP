.class public final Lio/ktor/utils/io/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lio/ktor/utils/io/m;

.field public x:Lkotlin/jvm/functions/Function1;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lio/ktor/utils/io/m;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/a;->z:Lio/ktor/utils/io/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/a;->y:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/a;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lio/ktor/utils/io/a;->z:Lio/ktor/utils/io/m;

    invoke-virtual {v1, p1, v0, p0}, Lio/ktor/utils/io/m;->e(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
