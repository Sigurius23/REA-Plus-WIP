.class public final Lzg0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010%\u001a\u0004\u0008\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010%\u001a\u0004\u0008\u001c\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010&\u001a\u0004\u0008 \u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lzg0/k;",
        "",
        "Lcom/whoop/ai/chat/models/AttachmentType;",
        "type",
        "",
        "isUploading",
        "isError",
        "Landroid/net/Uri;",
        "uri",
        "",
        "displayName",
        "fileId",
        "Lkd1/o;",
        "imageSource",
        "<init>",
        "(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/ai/chat/models/AttachmentType;",
        "d",
        "()Lcom/whoop/ai/chat/models/AttachmentType;",
        "b",
        "Z",
        "g",
        "()Z",
        "c",
        "f",
        "Landroid/net/Uri;",
        "e",
        "()Landroid/net/Uri;",
        "Ljava/lang/String;",
        "Lkd1/o;",
        "()Lkd1/o;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final h:I = 0x8


# instance fields
.field private final a:Lcom/whoop/ai/chat/models/AttachmentType;

.field private final b:Z

.field private final c:Z

.field private final d:Landroid/net/Uri;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Lkd1/o;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    .line 3
    iput-boolean p2, p0, Lzg0/k;->b:Z

    .line 4
    iput-boolean p3, p0, Lzg0/k;->c:Z

    .line 5
    iput-object p4, p0, Lzg0/k;->d:Landroid/net/Uri;

    .line 6
    iput-object p5, p0, Lzg0/k;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lzg0/k;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lzg0/k;->g:Lkd1/o;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    .line 9
    const-string p5, ""

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lzg0/k;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzg0/k;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzg0/k;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lzg0/k;->g:Lkd1/o;

    return-object v0
.end method

.method public final d()Lcom/whoop/ai/chat/models/AttachmentType;
    .locals 1

    iget-object v0, p0, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    return-object v0
.end method

.method public final e()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lzg0/k;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzg0/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzg0/k;

    iget-object v1, p0, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v3, p1, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lzg0/k;->b:Z

    iget-boolean v3, p1, Lzg0/k;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lzg0/k;->c:Z

    iget-boolean v3, p1, Lzg0/k;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lzg0/k;->d:Landroid/net/Uri;

    iget-object v3, p1, Lzg0/k;->d:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lzg0/k;->e:Ljava/lang/String;

    iget-object v3, p1, Lzg0/k;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lzg0/k;->f:Ljava/lang/String;

    iget-object v3, p1, Lzg0/k;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lzg0/k;->g:Lkd1/o;

    iget-object p1, p1, Lzg0/k;->g:Lkd1/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lzg0/k;->c:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lzg0/k;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lzg0/k;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lzg0/k;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lzg0/k;->d:Landroid/net/Uri;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/net/Uri;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzg0/k;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lzg0/k;->f:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lzg0/k;->g:Lkd1/o;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lzg0/k;->a:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-boolean v1, p0, Lzg0/k;->b:Z

    iget-boolean v2, p0, Lzg0/k;->c:Z

    iget-object v3, p0, Lzg0/k;->d:Landroid/net/Uri;

    iget-object v4, p0, Lzg0/k;->e:Ljava/lang/String;

    iget-object v5, p0, Lzg0/k;->f:Ljava/lang/String;

    iget-object v6, p0, Lzg0/k;->g:Lkd1/o;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "AttachmentUploadState(type="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isUploading="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isError="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", uri="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileId="

    const-string v1, ", imageSource="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
