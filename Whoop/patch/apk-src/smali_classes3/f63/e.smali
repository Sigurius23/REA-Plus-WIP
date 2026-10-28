.class public final Lf63/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# direct methods
.method public constructor <init>(Ls83/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf63/e;->w:Ljava/lang/Object;

    iget p1, p0, Lf63/e;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf63/e;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lj93/l0;->j(Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
