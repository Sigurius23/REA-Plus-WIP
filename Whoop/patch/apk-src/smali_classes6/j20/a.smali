.class public final Lj20/a;
.super Ldz/i;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Z

.field public final y:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/Integer;)V
    .locals 1

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj20/a;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lj20/a;->x:Z

    iput-object p3, p0, Lj20/a;->y:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 4

    new-instance v0, Ll83/k;

    const-string v1, "address_country_code"

    iget-object v2, p0, Lj20/a;->w:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lj20/a;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "auto_complete_result_selected"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Lj20/a;->y:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "edit_distance"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll83/k;

    const-string v2, "address_data_blob"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "mc_address_completed"

    return-object v0
.end method
