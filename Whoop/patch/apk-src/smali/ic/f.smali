.class public final Lic/f;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final w:Lic/f;

.field public static final x:Lkc3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lic/f;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    sput-object v0, Lic/f;->w:Lic/f;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sput-object v0, Lic/f;->x:Lkc3/e;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/f;->x:Lkc3/e;

    invoke-virtual {v0, p1, p2}, Lkc3/h;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/f;->x:Lkc3/e;

    invoke-virtual {v0, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result p1

    return p1
.end method
