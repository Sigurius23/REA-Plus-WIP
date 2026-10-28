.class public final Lsv0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsv0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lsv0/c;",
        "",
        "Leb/a0;",
        "fragmentNavController",
        "composeNavController",
        "<init>",
        "(Leb/a0;Leb/a0;)V",
        "event",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Object;)V",
        "Leb/a0;",
        "b",
        "c",
        "content-search_release"
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
.field public static final c:Lsv0/c$a;

.field public static final d:I


# instance fields
.field private final a:Leb/a0;

.field private final b:Leb/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsv0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsv0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsv0/c;->c:Lsv0/c$a;

    const/16 v0, 0x8

    sput v0, Lsv0/c;->d:I

    return-void
.end method

.method public constructor <init>(Leb/a0;Leb/a0;)V
    .locals 1

    const-string v0, "fragmentNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv0/c;->a:Leb/a0;

    iput-object p2, p0, Lsv0/c;->b:Leb/a0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpv0/a$c;

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsv0/c;->b:Leb/a0;

    const-string v0, "SEARCH"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_0
    instance-of v0, p1, Lpv0/a$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lsv0/c;->b:Leb/a0;

    const-string v0, "LANDING"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_1
    instance-of v0, p1, Lpv0/a$a;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lsv0/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Lc41/z2;

    if-eqz v0, :cond_4

    check-cast p1, Lc41/z2;

    invoke-virtual {p1}, Lc41/z2;->c()Lc41/d3;

    move-result-object v0

    sget-object v1, Lc41/d3;->VIDEO:Lc41/d3;

    if-ne v0, v1, :cond_3

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lsv0/c;->a:Leb/a0;

    iget-object v1, v1, Leb/a0;->a:Landroid/content/Context;

    const-class v2, Lcom/whoop/video/VideoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "videoUrl"

    invoke-virtual {p1}, Lc41/z2;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "SHOULD_SUBTITLES_DEFAULT_TO_OFF"

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object p1, p0, Lsv0/c;->a:Leb/a0;

    iget-object p1, p1, Leb/a0;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Lc41/z2;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "&"

    const-string v3, "%26"

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "+"

    const-string v3, "%2B"

    invoke-static {v0, v1, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lc41/z2;->c()Lc41/d3;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lc41/z2;->b()Ljava/lang/String;

    move-result-object p1

    const-string v3, "&entryPoint=Content Search&eventName=Content Search&contentType="

    const-string v4, "&articleId="

    const-string v5, "android-app://com.whoop/education?path="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/k0;

    invoke-direct {v0, p1, v2, v2}, Leb/k0;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lsv0/c;->a:Leb/a0;

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    :cond_4
    return-void
.end method
