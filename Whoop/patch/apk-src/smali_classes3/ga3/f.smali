.class public final Lga3/f;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lga3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lga3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lga3/f;->w:Lga3/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lga3/g;->g:[Lj93/z;

    sget-object v0, Lga3/c;->a:Lva3/h;

    new-instance v1, Lab3/x;

    const-string v2, "Deprecated in Java"

    invoke-direct {v1, v2}, Lab3/g;-><init>(Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
