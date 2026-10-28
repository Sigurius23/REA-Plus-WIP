.class public final Ll3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ll3/e0;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll3/e0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll3/e0;-><init>(ZI)V

    sput-object v0, Ll3/e0;->b:Ll3/e0;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ll3/e0;->a:Z

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Ll3/e0;->a:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll3/e0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll3/e0;

    iget-boolean p1, p1, Ll3/e0;->a:Z

    iget-boolean v1, p0, Ll3/e0;->a:Z

    if-eq v1, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Ll3/e0;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PlatformParagraphStyle(includeFontPadding="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ll3/e0;->a:Z

    const-string v2, ", emojiSupportMatch=EmojiSupportMatch.Default)"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
