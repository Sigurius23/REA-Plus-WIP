.class public final Lhb3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhb3/i;

.field public final b:Lsa3/f;

.field public final c:Lr93/k;

.field public final d:Lsa3/h;

.field public final e:Lsa3/j;

.field public final f:Lsa3/a;

.field public final g:Ljb3/j;

.field public final h:Lhb3/h0;

.field public final i:Lhb3/x;


# direct methods
.method public constructor <init>(Lhb3/i;Lsa3/f;Lr93/k;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;Lhb3/h0;Ljava/util/List;)V
    .locals 1

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameters"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/k;->a:Lhb3/i;

    iput-object p2, p0, Lhb3/k;->b:Lsa3/f;

    iput-object p3, p0, Lhb3/k;->c:Lr93/k;

    iput-object p4, p0, Lhb3/k;->d:Lsa3/h;

    iput-object p5, p0, Lhb3/k;->e:Lsa3/j;

    iput-object p6, p0, Lhb3/k;->f:Lsa3/a;

    iput-object p7, p0, Lhb3/k;->g:Ljb3/j;

    new-instance p1, Lhb3/h0;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Deserializer for \""

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p3}, Lr93/k;->getName()Lva3/h;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p3, 0x22

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    if-eqz p7, :cond_1

    invoke-interface {p7}, Ljb3/j;->j()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object p6, p2

    move-object p3, p8

    move-object p4, p9

    move-object p2, p0

    goto :goto_2

    :cond_1
    :goto_1
    const-string p2, "[container not found]"

    goto :goto_0

    :goto_2
    invoke-direct/range {p1 .. p6}, Lhb3/h0;-><init>(Lhb3/k;Lhb3/h0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p2, Lhb3/k;->h:Lhb3/h0;

    new-instance p1, Lhb3/x;

    invoke-direct {p1, p0}, Lhb3/x;-><init>(Lhb3/k;)V

    iput-object p1, p2, Lhb3/k;->i:Lhb3/x;

    return-void
.end method

.method public static synthetic b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;
    .locals 7

    iget-object v3, p0, Lhb3/k;->b:Lsa3/f;

    iget-object v4, p0, Lhb3/k;->d:Lsa3/h;

    iget-object v5, p0, Lhb3/k;->e:Lsa3/j;

    iget-object v6, p0, Lhb3/k;->f:Lsa3/a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lhb3/k;->a(Lr93/k;Ljava/util/List;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;)Lhb3/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lr93/k;Ljava/util/List;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;)Lhb3/k;
    .locals 10

    move-object/from16 v6, p6

    const-string v0, "typeParameterProtos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb3/k;

    iget v1, v6, Lsa3/a;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget v3, v6, Lsa3/a;->c:I

    const/4 v4, 0x4

    if-ge v3, v4, :cond_1

    :cond_0
    if-le v1, v2, :cond_2

    :cond_1
    :goto_0
    move-object v5, p5

    goto :goto_1

    :cond_2
    iget-object p5, p0, Lhb3/k;->e:Lsa3/j;

    goto :goto_0

    :goto_1
    iget-object v7, p0, Lhb3/k;->g:Ljb3/j;

    iget-object v8, p0, Lhb3/k;->h:Lhb3/h0;

    iget-object v1, p0, Lhb3/k;->a:Lhb3/i;

    move-object v3, p1

    move-object v9, p2

    move-object v2, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v9}, Lhb3/k;-><init>(Lhb3/i;Lsa3/f;Lr93/k;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;Lhb3/h0;Ljava/util/List;)V

    return-object v0
.end method
