.class public Lp92/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lrd1/d;

.field private final b:I


# direct methods
.method public constructor <init>(ILrd1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp92/i;->b:I

    iput-object p2, p0, Lp92/i;->a:Lrd1/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lp92/i;->a:Lrd1/d;

    iget v1, p0, Lp92/i;->b:I

    invoke-virtual {v0, v1}, Lrd1/d;->X(I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lp92/i;->a:Lrd1/d;

    iget v1, p0, Lp92/i;->b:I

    invoke-virtual {v0, v1}, Lrd1/d;->Z(I)V

    return-void
.end method
