.class public final Lr93/x;
.super Lr93/y0;
.source "SourceFile"


# instance fields
.field public final a:Lva3/h;

.field public final b:Lob3/h;


# direct methods
.method public constructor <init>(Lva3/h;Lob3/h;)V
    .locals 1

    const-string v0, "underlyingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr93/x;->a:Lva3/h;

    iput-object p2, p0, Lr93/x;->b:Lob3/h;

    return-void
.end method


# virtual methods
.method public final a(Lva3/h;)Z
    .locals 1

    iget-object v0, p0, Lr93/x;->a:Lva3/h;

    invoke-virtual {v0, p1}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InlineClassRepresentation(underlyingPropertyName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lr93/x;->a:Lva3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", underlyingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr93/x;->b:Lob3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
