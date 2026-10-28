.class public final La30/c0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:La30/w0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lkr/e;

.field public z:I


# direct methods
.method public constructor <init>(Lkr/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/c0;->y:Lkr/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La30/c0;->x:Ljava/lang/Object;

    iget p1, p0, La30/c0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/c0;->z:I

    iget-object p1, p0, La30/c0;->y:Lkr/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lkr/e;->h(Ljava/util/List;La30/w0;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
