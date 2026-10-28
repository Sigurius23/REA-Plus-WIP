.class public final Ly42/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R#\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0006\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u001b\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Ly42/e;",
        "",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "",
        "macAddress",
        "<init>",
        "(Ltr2/n;Lbc3/c0;Ljava/lang/String;)V",
        "Lc52/a;",
        "event",
        "Ll83/a0;",
        "e",
        "(Lc52/a;)V",
        "a",
        "Ltr2/n;",
        "b",
        "Lbc3/c0;",
        "c",
        "Ljava/lang/String;",
        "Lec3/o1;",
        "d",
        "Lec3/o1;",
        "_connectionEvent",
        "Lec3/f2;",
        "Lc52/b;",
        "Lec3/f2;",
        "()Lec3/f2;",
        "getConnectionState$annotations",
        "()V",
        "connectionState",
        "puffin_release"
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
.field private final a:Ltr2/n;

.field private final b:Lbc3/c0;

.field private final c:Ljava/lang/String;

.field private final d:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final e:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lbc3/c0;Ljava/lang/String;)V
    .locals 3

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "macAddress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly42/e;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Ly42/e;->b:Lbc3/c0;

    .line 4
    iput-object p3, p0, Ly42/e;->c:Ljava/lang/String;

    .line 5
    sget-object p1, Ldc3/a;->w:Ldc3/a;

    const/4 p3, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {p3, v0, p1, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ly42/e;->d:Lec3/o1;

    .line 6
    sget-object p3, Lc52/b$c;->a:Lc52/b$c;

    new-instance v0, Ly42/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly42/e$a;-><init>(Ly42/e;Lq83/d;)V

    .line 7
    new-instance v2, Lec3/l1;

    invoke-direct {v2, p3, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 8
    new-instance p1, Ly42/e$b;

    invoke-direct {p1, p0, v1}, Ly42/e$b;-><init>(Ly42/e;Lq83/d;)V

    .line 9
    new-instance v0, Lec3/j1;

    const/4 v1, 0x0

    invoke-direct {v0, v2, p1, v1}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 10
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 11
    invoke-static {v0, p2, p1, p3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Ly42/e;->e:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lbc3/c0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 12
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PuffinConnectionStateManager"

    invoke-virtual {p1, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ly42/e;-><init>(Ltr2/n;Lbc3/c0;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Ly42/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ly42/e;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Ly42/e;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly42/e;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(Ly42/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ly42/e;->d:Lec3/o1;

    return-object p0
.end method


# virtual methods
.method public final d()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Ly42/e;->e:Lec3/f2;

    return-object v0
.end method

.method public final e(Lc52/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/e;->b:Lbc3/c0;

    new-instance v1, Ly42/e$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ly42/e$c;-><init>(Ly42/e;Lc52/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
