.class public final Lx51/a$c;
.super Lx51/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx51/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006*"
    }
    d2 = {
        "Lx51/a$c;",
        "Lx51/a;",
        "Ly71/g;",
        "genericIcon",
        "Lcom/whoop/design/util/TextResource;",
        "genericDisplayText",
        "",
        "genericIsGlowing",
        "",
        "genericTestTag",
        "Lkd1/l;",
        "genericType",
        "<init>",
        "(Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "g",
        "Ly71/g;",
        "getGenericIcon",
        "()Ly71/g;",
        "h",
        "Lcom/whoop/design/util/TextResource;",
        "getGenericDisplayText",
        "()Lcom/whoop/design/util/TextResource;",
        "i",
        "Z",
        "getGenericIsGlowing",
        "()Z",
        "j",
        "Ljava/lang/String;",
        "getGenericTestTag",
        "k",
        "Lkd1/l;",
        "getGenericType",
        "()Lkd1/l;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final g:Ly71/g;

.field private final h:Lcom/whoop/design/util/TextResource;

.field private final i:Z

.field private final j:Ljava/lang/String;

.field private final k:Lkd1/l;


# direct methods
.method public constructor <init>(Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;)V
    .locals 10

    const-string v0, "genericIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "genericDisplayText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "genericTestTag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "genericType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v9}, Lx51/a;-><init>(Ljava/lang/Object;Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v1, Lx51/a$c;->g:Ly71/g;

    iput-object v4, v1, Lx51/a$c;->h:Lcom/whoop/design/util/TextResource;

    iput-boolean v5, v1, Lx51/a$c;->i:Z

    iput-object v6, v1, Lx51/a$c;->j:Ljava/lang/String;

    iput-object v7, v1, Lx51/a$c;->k:Lkd1/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx51/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx51/a$c;

    iget-object v1, p0, Lx51/a$c;->g:Ly71/g;

    iget-object v3, p1, Lx51/a$c;->g:Ly71/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lx51/a$c;->h:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lx51/a$c;->h:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lx51/a$c;->i:Z

    iget-boolean v3, p1, Lx51/a$c;->i:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lx51/a$c;->j:Ljava/lang/String;

    iget-object v3, p1, Lx51/a$c;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lx51/a$c;->k:Lkd1/l;

    iget-object p1, p1, Lx51/a$c;->k:Lkd1/l;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx51/a$c;->g:Ly71/g;

    invoke-virtual {v0}, Ly71/g;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lx51/a$c;->h:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lx51/a$c;->i:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lx51/a$c;->j:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lx51/a$c;->k:Lkd1/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lx51/a$c;->g:Ly71/g;

    iget-object v1, p0, Lx51/a$c;->h:Lcom/whoop/design/util/TextResource;

    iget-boolean v2, p0, Lx51/a$c;->i:Z

    iget-object v3, p0, Lx51/a$c;->j:Ljava/lang/String;

    iget-object v4, p0, Lx51/a$c;->k:Lkd1/l;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BackendFabItem(genericIcon="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", genericDisplayText="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", genericIsGlowing="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", genericTestTag="

    const-string v1, ", genericType="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
