.class public final Lxu2/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lxu2/a$c;",
        "Lxu2/a;",
        "",
        "enabled",
        "<init>",
        "(Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "()Z",
        "Lcom/whoop/design/util/TextResource$b;",
        "b",
        "Lcom/whoop/design/util/TextResource$b;",
        "e",
        "()Lcom/whoop/design/util/TextResource$b;",
        "text",
        "c",
        "useAccentColor",
        "Lhu2/b$o;",
        "d",
        "Lhu2/b$o;",
        "()Lhu2/b$o;",
        "clickEvent",
        "weightlifting_release"
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
.field public static final e:I


# instance fields
.field private final a:Z

.field private final b:Lcom/whoop/design/util/TextResource$b;

.field private final c:Z

.field private final d:Lhu2/b$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    sput v0, Lxu2/a$c;->e:I

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lxu2/a$c;->a:Z

    sget p1, Lcu2/h;->I:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    iput-object p1, p0, Lxu2/a$c;->b:Lcom/whoop/design/util/TextResource$b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lxu2/a$c;->c:Z

    sget-object p1, Lhu2/b$o;->w:Lhu2/b$o;

    iput-object p1, p0, Lxu2/a$c;->d:Lhu2/b$o;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lxu2/a$c;->a:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lxu2/a$c;->c:Z

    return v0
.end method

.method public bridge synthetic c()Lhu2/b;
    .locals 1

    invoke-virtual {p0}, Lxu2/a$c;->d()Lhu2/b$o;

    move-result-object v0

    return-object v0
.end method

.method public d()Lhu2/b$o;
    .locals 1

    iget-object v0, p0, Lxu2/a$c;->d:Lhu2/b$o;

    return-object v0
.end method

.method public e()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    iget-object v0, p0, Lxu2/a$c;->b:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxu2/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxu2/a$c;

    iget-boolean v1, p0, Lxu2/a$c;->a:Z

    iget-boolean p1, p1, Lxu2/a$c;->a:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/a$c;->e()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lxu2/a$c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lxu2/a$c;->a:Z

    const-string v1, "StartWorkout(enabled="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
