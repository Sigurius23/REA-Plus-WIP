.class public final Ln8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# static fields
.field public static final a:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln8/b;->a:Ln8/b;

    return-void
.end method


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0

    const-string p2, "modelClass"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lbi/g;->w(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
