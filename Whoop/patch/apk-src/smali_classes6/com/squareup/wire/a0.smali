.class public interface abstract annotation Lcom/squareup/wire/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/squareup/wire/a0;
        declaredName = ""
        jsonName = ""
        keyAdapter = ""
        label = .enum Lcom/squareup/wire/z;->x:Lcom/squareup/wire/z;
        oneofName = ""
        redacted = false
        schemaIndex = -0x1
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract adapter()Ljava/lang/String;
.end method

.method public abstract declaredName()Ljava/lang/String;
.end method

.method public abstract jsonName()Ljava/lang/String;
.end method

.method public abstract keyAdapter()Ljava/lang/String;
.end method

.method public abstract label()Lcom/squareup/wire/z;
.end method

.method public abstract oneofName()Ljava/lang/String;
.end method

.method public abstract redacted()Z
.end method

.method public abstract schemaIndex()I
.end method

.method public abstract tag()I
.end method
