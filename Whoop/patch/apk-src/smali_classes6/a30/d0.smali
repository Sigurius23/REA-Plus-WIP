.class public final La30/d0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:La30/e0;

.field public y:I


# direct methods
.method public constructor <init>(La30/e0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/d0;->x:La30/e0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La30/d0;->w:Ljava/lang/Object;

    iget p1, p0, La30/d0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/d0;->y:I

    iget-object p1, p0, La30/d0;->x:La30/e0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, La30/e0;->a(Lmy/a;Lz20/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
