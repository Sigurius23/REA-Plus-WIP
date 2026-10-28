.class public abstract Lqc3/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsc3/u;

.field public static final b:Lsc3/u;

.field public static final c:Lsc3/u;

.field public static final d:Lsc3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsc3/u;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/t0;->w:Lqc3/t0;

    invoke-direct {v1, v2}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/16 v2, 0x17

    const/4 v3, 0x0

    const/16 v4, 0x38

    invoke-direct {v0, v1, v2, v3, v4}, Lsc3/u;-><init>(Lsc3/r;ILqc3/l0;I)V

    sput-object v0, Lqc3/x0;->a:Lsc3/u;

    new-instance v0, Lsc3/u;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/v0;->w:Lqc3/v0;

    invoke-direct {v1, v2}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/16 v2, 0x3b

    invoke-direct {v0, v1, v2, v3, v4}, Lsc3/u;-><init>(Lsc3/r;ILqc3/l0;I)V

    sput-object v0, Lqc3/x0;->b:Lsc3/u;

    new-instance v0, Lsc3/u;

    new-instance v1, Lsc3/r;

    sget-object v4, Lqc3/w0;->w:Lqc3/w0;

    invoke-direct {v1, v4}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/16 v4, 0x28

    invoke-direct {v0, v1, v2, v3, v4}, Lsc3/u;-><init>(Lsc3/r;ILqc3/l0;I)V

    sput-object v0, Lqc3/x0;->c:Lsc3/u;

    new-instance v0, Lsc3/m;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/s0;->w:Lqc3/s0;

    const-string v3, "nanosecond"

    invoke-direct {v1, v2, v3}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;Ljava/lang/String;)V

    new-instance v2, Lrc3/a;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Lrc3/a;-><init>(II)V

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lsc3/m;-><init>(Lsc3/r;Lrc3/a;I)V

    sput-object v0, Lqc3/x0;->d:Lsc3/m;

    sget-object v0, Lqc3/r0;->w:Lqc3/r0;

    invoke-interface {v0}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqc3/u0;->w:Lqc3/u0;

    invoke-interface {v0}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
