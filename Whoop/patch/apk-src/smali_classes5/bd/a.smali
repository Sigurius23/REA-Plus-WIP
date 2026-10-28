.class public final Lbd/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Luf/w;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lbd/b;

.field public z:I


# direct methods
.method public constructor <init>(Lbd/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbd/a;->y:Lbd/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbd/a;->x:Ljava/lang/Object;

    iget p1, p0, Lbd/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbd/a;->z:I

    iget-object p1, p0, Lbd/a;->y:Lbd/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lbd/b;->c(Luf/w;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
