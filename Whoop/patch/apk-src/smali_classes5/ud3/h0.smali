.class public final Lud3/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lyb3/p;

.field public static final f:Lyb3/p;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lud3/h0;->e:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, ";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lud3/h0;->f:Lyb3/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "mediaType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterNamesAndValues"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/h0;->a:Ljava/lang/String;

    iput-object p2, p0, Lud3/h0;->b:Ljava/lang/String;

    iput-object p3, p0, Lud3/h0;->c:Ljava/lang/String;

    iput-object p4, p0, Lud3/h0;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 6

    iget-object v0, p0, Lud3/h0;->d:[Ljava/lang/String;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Lj93/l0;->F(III)I

    move-result v1

    if-ltz v1, :cond_1

    :goto_0
    aget-object v2, v0, v3

    const-string v4, "charset"

    const/4 v5, 0x1

    invoke-static {v2, v4, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/2addr v3, v5

    aget-object v0, v0, v3

    goto :goto_1

    :cond_0
    if-eq v3, v1, :cond_1

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    return-object p1

    :cond_2
    :try_start_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lud3/h0;

    if-eqz v0, :cond_0

    check-cast p1, Lud3/h0;

    iget-object p1, p1, Lud3/h0;->a:Ljava/lang/String;

    iget-object v0, p0, Lud3/h0;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lud3/h0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lud3/h0;->a:Ljava/lang/String;

    return-object v0
.end method
