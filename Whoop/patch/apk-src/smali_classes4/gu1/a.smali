.class public final Lgu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lgu1/a;",
        "",
        "Lts0/a;",
        "strapSyncService",
        "Lku1/a;",
        "labradorPacketsUploadManager",
        "Leu1/b;",
        "analyticsHelper",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lts0/a;Lku1/a;Leu1/b;Lbc3/c0;)V",
        "Ll83/a0;",
        "c",
        "()V",
        "a",
        "Lts0/a;",
        "b",
        "Lku1/a;",
        "Leu1/b;",
        "d",
        "Lbc3/c0;",
        "labrador-service_release"
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
.field private final a:Lts0/a;

.field private final b:Lku1/a;

.field private final c:Leu1/b;

.field private final d:Lbc3/c0;


# direct methods
.method public constructor <init>(Lts0/a;Lku1/a;Leu1/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "strapSyncService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labradorPacketsUploadManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgu1/a;->a:Lts0/a;

    iput-object p2, p0, Lgu1/a;->b:Lku1/a;

    iput-object p3, p0, Lgu1/a;->c:Leu1/b;

    iput-object p4, p0, Lgu1/a;->d:Lbc3/c0;

    return-void
.end method

.method public static final synthetic a(Lgu1/a;)Leu1/b;
    .locals 0

    iget-object p0, p0, Lgu1/a;->c:Leu1/b;

    return-object p0
.end method

.method public static final synthetic b(Lgu1/a;)Lku1/a;
    .locals 0

    iget-object p0, p0, Lgu1/a;->b:Lku1/a;

    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lgu1/a;->c:Leu1/b;

    sget-object v1, Leu1/a;->ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW:Leu1/a;

    invoke-virtual {v0, v1}, Leu1/b;->a(Leu1/a;)V

    iget-object v0, p0, Lgu1/a;->a:Lts0/a;

    sget-object v1, Lts0/d$a;->a:Lts0/d$a;

    invoke-interface {v0, v1}, Lts0/a;->a(Lts0/d;)Lec3/l;

    move-result-object v0

    new-instance v1, Lgu1/a$a;

    invoke-direct {v1, v0, p0}, Lgu1/a$a;-><init>(Lec3/l;Lgu1/a;)V

    iget-object v0, p0, Lgu1/a;->d:Lbc3/c0;

    invoke-static {v1, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method
