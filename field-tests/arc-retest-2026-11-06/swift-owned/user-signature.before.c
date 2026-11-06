
/* WARNING: Removing unreachable block (ram,0x00000ee4) */

void __protocol_witness_for_Swift_Decodable_init_from__Swift_Decoder__throws__>_A_in_conformance_OwnedErrorABI_OwnedPayload___Swift_Decodable_in_OwnedErrorABI
               (String *param_1,long param_2)

{
  long lVar1;
  KeyedDecodingContainer<undefined> KVar2;
  long extraout_x8;
  long unaff_x21;
  long lVar3;
  String SVar4;
  
  lVar1 = 0x8000;
  ___swift_instantiateConcreteTypeFromMangledNameV2
            (0x8000,&
                    __mangled_name_ref_for_type_metadata_for_Swift_KeyedDecodingContainer<OwnedErrorABI_OwnedPayload_CodingKeys>
            );
  lVar3 = *(long *)(lVar1 + -8);
  (*(code *)PTR____chkstk_darwin_00004000)(*(long *)(lVar3 + 0x40) + 0xfU & 0xfffffffffffffff0);
  ___swift_project_boxed_opaque_existential_1(param_2,*(undefined8 *)(param_2 + 0x18));
  OwnedErrorABI::OwnedPayload::CodingKeys::_lazy_protocol_witness_table_accessor();
  KVar2 = Swift::Decoder::_container();
  if (unaff_x21 == 0) {
    SVar4 = Swift::KeyedDecodingContainer::_decode(KVar2.unknown,lVar1);
    (**(code **)(lVar3 + 8))(&stack0xffffffffffffffa0 + -extraout_x8,lVar1);
    ___swift_destroy_boxed_opaque_existential_1(param_2);
    *param_1 = SVar4;
  }
  else {
    ___swift_destroy_boxed_opaque_existential_1(param_2);
  }
  return;
}

