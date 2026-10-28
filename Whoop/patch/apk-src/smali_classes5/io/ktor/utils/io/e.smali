.class public final Lio/ktor/utils/io/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lw63/a;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lio/ktor/utils/io/m;

.field public H:I

.field public w:Lio/ktor/utils/io/m;

.field public x:Lv63/d;

.field public y:Lkotlin/jvm/internal/f0;

.field public z:Lv63/d;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/e;->G:Lio/ktor/utils/io/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/e;->F:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/e;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/e;->H:I

    iget-object p1, p0, Lio/ktor/utils/io/e;->G:Lio/ktor/utils/io/m;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lio/ktor/utils/io/m;->w(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
