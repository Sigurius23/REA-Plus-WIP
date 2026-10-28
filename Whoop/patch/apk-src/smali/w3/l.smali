.class public final Lw3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lw3/l;

.field public static final c:Lw3/l;

.field public static final d:Lw3/l;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw3/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw3/l;-><init>(I)V

    sput-object v0, Lw3/l;->b:Lw3/l;

    new-instance v0, Lw3/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw3/l;-><init>(I)V

    sput-object v0, Lw3/l;->c:Lw3/l;

    new-instance v0, Lw3/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lw3/l;-><init>(I)V

    sput-object v0, Lw3/l;->d:Lw3/l;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw3/l;->a:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw3/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw3/l;

    iget p1, p1, Lw3/l;->a:I

    iget v1, p0, Lw3/l;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lw3/l;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lw3/l;->a:I

    if-nez v0, :cond_0

    const-string v0, "TextDecoration.None"

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_1

    const-string v2, "Underline"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    const-string v0, "LineThrough"

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "TextDecoration."

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "TextDecoration["

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/16 v3, 0x3e

    const-string v4, ", "

    invoke-static {v3, v4, v1, v2}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x5d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
