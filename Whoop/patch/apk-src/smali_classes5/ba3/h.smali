.class public final Lba3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lba3/h;->a:I

    iput p2, p0, Lba3/h;->b:I

    iput p3, p0, Lba3/h;->c:I

    return-void
.end method

.method public constructor <init>(Lq1/j0;I)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget v0, p1, Lq1/j0;->b:I

    iget p1, p1, Lq1/j0;->c:I

    invoke-direct {p0, v0, p1, p2}, Lba3/h;-><init>(III)V

    return-void
.end method

.method public constructor <init>(Lsa3/b;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Lba3/h;-><init>(Lq1/j0;I)V

    return-void
.end method
