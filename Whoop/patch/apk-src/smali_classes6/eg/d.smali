.class public final Leg/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Leg/f;

.field public y:I


# direct methods
.method public constructor <init>(Leg/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Leg/d;->x:Leg/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Leg/d;->w:Ljava/lang/Object;

    iget p1, p0, Leg/d;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leg/d;->y:I

    iget-object p1, p0, Leg/d;->x:Leg/f;

    invoke-virtual {p1, p0}, Leg/f;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
