.class public final Lwd3/a;
.super Lv63/c;
.source "SourceFile"


# static fields
.field public static final a:Lwd3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwd3/a;->a:Lwd3/a;

    return-void
.end method


# virtual methods
.method public final d(Lj93/d;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(Lj93/d;Ljava/lang/Object;)Lv63/c;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance v0, Lwd3/c;

    invoke-direct {v0, p1, p2, p0}, Lwd3/c;-><init>(Lj93/d;Ljava/lang/Object;Lv63/c;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "{}"

    return-object v0
.end method
