<?php
namespace Thrift\CeCd\Sdk;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
interface RpcServiceIf
{
    /**
     * @param string $classname
     * @param string $method
     * @param string $arglist
     * @param string $extra
     * @return \Thrift\CeCd\Sdk\ResponseData
     * @throws \Thrift\CeCd\Sdk\InvalidException
     */
    public function callRpc($classname, $method, $arglist, $extra);
}
