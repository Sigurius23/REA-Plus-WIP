.class public final Lqb3/b;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lqb3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqb3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lqb3/b;->w:Lqb3/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb3/f1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    instance-of p1, p1, Lza3/b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
