.class public final synthetic Ln0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln0/v;->w:I

    iput p2, p0, Ln0/v;->x:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    new-instance v0, Ln0/u;

    iget v1, p0, Ln0/v;->w:I

    iget v2, p0, Ln0/v;->x:I

    invoke-direct {v0, v1, v2}, Ln0/u;-><init>(II)V

    return-object v0
.end method
