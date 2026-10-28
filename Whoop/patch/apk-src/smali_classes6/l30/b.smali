.class public final Ll30/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lai/j;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lai/j;

.field public z:I


# direct methods
.method public constructor <init>(Lai/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ll30/b;->y:Lai/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ll30/b;->x:Ljava/lang/Object;

    iget p1, p0, Ll30/b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll30/b;->z:I

    iget-object p1, p0, Ll30/b;->y:Lai/j;

    invoke-virtual {p1, p0}, Lai/j;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
