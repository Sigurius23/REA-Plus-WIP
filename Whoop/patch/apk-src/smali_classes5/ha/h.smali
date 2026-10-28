.class public final Lha/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lha/h;->a:I

    .line 4
    iput p2, p0, Lha/h;->c:I

    .line 5
    iput-boolean p3, p0, Lha/h;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(IZI)V
    .locals 0

    .line 1
    iput p1, p0, Lha/h;->a:I

    iput-boolean p2, p0, Lha/h;->b:Z

    iput p3, p0, Lha/h;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Lha/h;
    .locals 3

    new-instance v0, Lha/h;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lha/h;-><init>(IIZ)V

    return-object v0
.end method
