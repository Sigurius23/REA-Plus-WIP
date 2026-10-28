.class public abstract Lto/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lcom/google/android/gms/common/c;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lto/q;->a:[Lcom/google/android/gms/common/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lto/q;->b:Z

    iput v0, p0, Lto/q;->c:I

    return-void
.end method

.method public constructor <init>([Lcom/google/android/gms/common/c;ZI)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/q;->a:[Lcom/google/android/gms/common/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lto/q;->b:Z

    iput p3, p0, Lto/q;->c:I

    return-void
.end method

.method public static a()Le73/b;
    .locals 2

    new-instance v0, Le73/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Le73/b;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Le73/b;->b:Z

    const/4 v1, 0x0

    iput v1, v0, Le73/b;->d:I

    return-object v0
.end method


# virtual methods
.method public abstract b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lto/q;->c:I

    return v0
.end method
