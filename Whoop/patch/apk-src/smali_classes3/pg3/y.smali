.class public final Lpg3/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpg3/y;->w:Ljava/lang/Object;

    iget p1, p0, Lpg3/y;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpg3/y;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lpg3/e1;->q(Ljava/lang/Throwable;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
