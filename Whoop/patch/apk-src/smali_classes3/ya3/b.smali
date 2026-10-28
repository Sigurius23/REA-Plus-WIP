.class public final Lya3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lya3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lya3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lya3/b;->a:Lya3/b;

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Lr93/e;
    .locals 1

    sget-object v0, Lva3/k;->A:Lva3/c;

    invoke-static {p1, v0}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object p1

    return-object p1
.end method
