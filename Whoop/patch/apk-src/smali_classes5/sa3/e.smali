.class public final Lsa3/e;
.super Lsa3/a;
.source "SourceFile"


# static fields
.field public static final g:Lsa3/e;

.field public static final h:Lsa3/e;


# instance fields
.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lsa3/e;

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x0

    filled-new-array {v1, v2, v3}, [I

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lsa3/e;-><init>([IZ)V

    sput-object v0, Lsa3/e;->g:Lsa3/e;

    iget v2, v0, Lsa3/a;->c:I

    iget v0, v0, Lsa3/a;->b:I

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    const/16 v5, 0x9

    if-ne v2, v5, :cond_0

    new-instance v0, Lsa3/e;

    filled-new-array {v1, v3, v3}, [I

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsa3/e;-><init>([IZ)V

    goto :goto_0

    :cond_0
    new-instance v1, Lsa3/e;

    add-int/2addr v2, v4

    filled-new-array {v0, v2, v3}, [I

    move-result-object v0

    invoke-direct {v1, v0, v3}, Lsa3/e;-><init>([IZ)V

    move-object v0, v1

    :goto_0
    sput-object v0, Lsa3/e;->h:Lsa3/e;

    new-instance v0, Lsa3/e;

    new-array v1, v3, [I

    invoke-direct {v0, v1, v3}, Lsa3/e;-><init>([IZ)V

    return-void
.end method

.method public constructor <init>([IZ)V
    .locals 1

    const-string v0, "versionArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lsa3/a;-><init>([I)V

    iput-boolean p2, p0, Lsa3/e;->f:Z

    return-void
.end method


# virtual methods
.method public final b(Lsa3/e;)Z
    .locals 5

    const-string v0, "metadataVersionFromLanguageVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lsa3/e;->f:Z

    if-eqz v0, :cond_0

    sget-object v0, Lsa3/e;->g:Lsa3/e;

    goto :goto_0

    :cond_0
    sget-object v0, Lsa3/e;->h:Lsa3/e;

    :goto_0
    iget v1, v0, Lsa3/a;->b:I

    iget v2, p1, Lsa3/a;->b:I

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    if-ge v1, v2, :cond_2

    goto :goto_2

    :cond_2
    iget v1, v0, Lsa3/a;->c:I

    iget v2, p1, Lsa3/a;->c:I

    if-le v1, v2, :cond_3

    :goto_1
    move-object p1, v0

    :cond_3
    :goto_2
    iget v0, p0, Lsa3/a;->c:I

    const/4 v1, 0x0

    iget v2, p0, Lsa3/a;->b:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    if-nez v2, :cond_5

    :goto_3
    return v1

    :cond_5
    iget v4, p1, Lsa3/a;->b:I

    if-le v2, v4, :cond_6

    :goto_4
    move v1, v3

    goto :goto_5

    :cond_6
    if-ge v2, v4, :cond_7

    goto :goto_5

    :cond_7
    iget p1, p1, Lsa3/a;->c:I

    if-le v0, p1, :cond_8

    goto :goto_4

    :cond_8
    :goto_5
    xor-int/lit8 p1, v1, 0x1

    return p1
.end method
