.class public final Lmz/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq30/w0;

.field public static final b:Lad3/r;

.field public static final c:Lkc3/d;

.field public static final d:Lqy/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqy/a;

    const-string v1, "financial_connections_client_api_beta=v1"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lqy/a;-><init>(ILjava/util/Set;)V

    new-instance v1, Lq30/w0;

    invoke-virtual {v0}, Lqy/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AndroidBindings/22.6.1"

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0, v2}, Lq30/w0;-><init>(Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lmz/a;->a:Lq30/w0;

    new-instance v0, Lmx1/o;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lmz/a;->b:Lad3/r;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    sput-object v0, Lmz/a;->c:Lkc3/d;

    sget-object v0, Lqy/e;->b:Lqy/d;

    sput-object v0, Lmz/a;->d:Lqy/d;

    return-void
.end method
