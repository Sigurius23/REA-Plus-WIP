.class public final Lqc3/q;
.super Lsc3/i;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/List;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lqc3/q;->d:Ljava/util/List;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v4, v0

    move-object v5, v2

    move-object v7, v0

    move-object v8, v2

    move-object v1, v0

    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "zerosToAdd"

    sget-object v1, Lqc3/q;->d:Ljava/util/List;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqc3/x0;->d:Lsc3/m;

    invoke-direct {p0, v0, v1}, Lsc3/i;-><init>(Lsc3/a;Ljava/util/List;)V

    const/4 v0, 0x1

    iput v0, p0, Lqc3/q;->b:I

    const/16 v0, 0x9

    iput v0, p0, Lqc3/q;->c:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lqc3/q;

    if-eqz v0, :cond_0

    check-cast p1, Lqc3/q;

    iget v0, p1, Lqc3/q;->b:I

    iget v1, p0, Lqc3/q;->b:I

    if-ne v1, v0, :cond_0

    iget v0, p0, Lqc3/q;->c:I

    iget p1, p1, Lqc3/q;->c:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lqc3/q;->b:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lqc3/q;->c:I

    add-int/2addr v0, v1

    return v0
.end method
