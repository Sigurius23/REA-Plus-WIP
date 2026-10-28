.class public abstract Lto/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lto/k;

.field public final b:I


# direct methods
.method public constructor <init>(Lto/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/l;->a:Lto/k;

    iput p2, p0, Lto/l;->b:I

    return-void
.end method


# virtual methods
.method public final a()Lto/j;
    .locals 1

    iget-object v0, p0, Lto/l;->a:Lto/k;

    iget-object v0, v0, Lto/k;->b:Lto/j;

    return-object v0
.end method

.method public abstract b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lto/l;->b:I

    return v0
.end method
