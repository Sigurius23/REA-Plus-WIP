.class public final Lrb3/b;
.super Lm83/b;
.source "SourceFile"


# instance fields
.field public y:I

.field public final synthetic z:Lrb3/c;


# direct methods
.method public constructor <init>(Lrb3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb3/b;->z:Lrb3/c;

    const/4 p1, -0x1

    iput p1, p0, Lrb3/b;->y:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    :cond_0
    iget v0, p0, Lrb3/b;->y:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lrb3/b;->y:I

    iget-object v2, p0, Lrb3/b;->z:Lrb3/c;

    iget-object v2, v2, Lrb3/c;->w:[Ljava/lang/Object;

    array-length v3, v2

    if-ge v0, v3, :cond_1

    aget-object v3, v2, v0

    if-eqz v3, :cond_0

    :cond_1
    array-length v3, v2

    if-lt v0, v3, :cond_2

    const/4 v0, 0x2

    iput v0, p0, Lm83/b;->w:I

    return-void

    :cond_2
    aget-object v0, v2, v0

    const-string v2, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lm83/b;->x:Ljava/lang/Object;

    iput v1, p0, Lm83/b;->w:I

    return-void
.end method
