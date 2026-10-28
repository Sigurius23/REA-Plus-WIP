.class public final Lu0/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lu0/r0;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Boolean;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu0/r0;

    const/4 v1, 0x0

    const/16 v2, 0x7f

    invoke-direct {v0, v1, v1, v1, v2}, Lu0/r0;-><init>(IIII)V

    sput-object v0, Lu0/r0;->e:Lu0/r0;

    return-void
.end method

.method public synthetic constructor <init>(IIII)V
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    move p1, v2

    :cond_0
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    and-int/lit8 v1, p4, 0x4

    if-eqz v1, :cond_2

    const/4 p2, 0x0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    move p3, v2

    .line 1
    :cond_3
    invoke-direct {p0, p1, v0, p2, p3}, Lu0/r0;-><init>(ILjava/lang/Boolean;II)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Boolean;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lu0/r0;->a:I

    .line 4
    iput-object p2, p0, Lu0/r0;->b:Ljava/lang/Boolean;

    .line 5
    iput p3, p0, Lu0/r0;->c:I

    .line 6
    iput p4, p0, Lu0/r0;->d:I

    return-void
.end method


# virtual methods
.method public final a(Z)Lq3/l;
    .locals 9

    new-instance v0, Lq3/l;

    new-instance v1, Lq3/m;

    iget v2, p0, Lu0/r0;->a:I

    invoke-direct {v1, v2}, Lq3/m;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    move-object v1, v3

    :cond_0
    if-eqz v1, :cond_1

    iget v1, v1, Lq3/m;->a:I

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v1, 0x1

    iget-object v5, p0, Lu0/r0;->b:Ljava/lang/Boolean;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    new-instance v6, Lq3/n;

    iget v7, p0, Lu0/r0;->c:I

    invoke-direct {v6, v7}, Lq3/n;-><init>(I)V

    if-nez v7, :cond_3

    move-object v6, v3

    :cond_3
    if-eqz v6, :cond_4

    iget v6, v6, Lq3/n;->a:I

    goto :goto_3

    :cond_4
    move v6, v1

    :goto_3
    new-instance v7, Lq3/k;

    iget v8, p0, Lu0/r0;->d:I

    invoke-direct {v7, v8}, Lq3/k;-><init>(I)V

    if-ne v8, v4, :cond_5

    goto :goto_4

    :cond_5
    move-object v3, v7

    :goto_4
    if-eqz v3, :cond_6

    iget v1, v3, Lq3/k;->a:I

    :cond_6
    move v4, v6

    sget-object v6, Ls3/b;->y:Ls3/b;

    move v3, v5

    move v5, v1

    move v1, p1

    invoke-direct/range {v0 .. v6}, Lq3/l;-><init>(ZIZIILs3/b;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lu0/r0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu0/r0;

    iget v0, p1, Lu0/r0;->a:I

    iget v1, p0, Lu0/r0;->a:I

    if-ne v1, v0, :cond_3

    iget-object v0, p0, Lu0/r0;->b:Ljava/lang/Boolean;

    iget-object v1, p1, Lu0/r0;->b:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget v0, p0, Lu0/r0;->c:I

    iget v1, p1, Lu0/r0;->c:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lu0/r0;->d:I

    iget p1, p1, Lu0/r0;->d:I

    if-ne v0, p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lu0/r0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lu0/r0;->b:Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lu0/r0;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lu0/r0;->d:I

    const/16 v2, 0x745f

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyboardOptions(capitalization="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lu0/r0;->a:I

    invoke-static {v1}, Lq3/m;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoCorrectEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu0/r0;->b:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu0/r0;->c:I

    invoke-static {v1}, Lq3/n;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu0/r0;->d:I

    invoke-static {v1}, Lq3/k;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
